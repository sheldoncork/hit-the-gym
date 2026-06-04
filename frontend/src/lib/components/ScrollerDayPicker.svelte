<script lang="ts">
	const today = new Date();
	today.setHours(0, 0, 0, 0);

	let selectedDate = $state(today);

	let { workoutHistory = {}, onSelectDay = (date: Date) => {} } = $props();

	// 1. Generate surrounding days (4 days before, today, 4 days after)
	const surroundingDays = $derived.by(() => {
		const days = [];
		for (let i = -4; i <= 4; i++) {
			const date = new Date(today);
			date.setDate(today.getDate() + i);
			date.setHours(0, 0, 0, 0);
			days.push(date);
		}
		return days;
	});

	// 2. Svelte Action to auto-scroll the container to center "today" on load
	function scrollToToday(node: HTMLElement) {
		const todayElement = node.querySelector('.today') as HTMLElement;
		if (todayElement) {
			// Center the element smoothly within the scrolling container
			node.scrollTo({
				left: todayElement.offsetLeft - node.offsetWidth / 2 + todayElement.offsetWidth / 2,
				behavior: 'smooth'
			});
		}
	}

	const getIsoKey = (date: Date) => date.toISOString().split('T')[0];
	const getDayLabel = (date: Date) => date.toLocaleDateString('en-US', { weekday: 'short' });
	const getDateNumber = (date: Date) => date.getDate();

	function selectDay(date: Date) {
		selectedDate = date;
		onSelectDay(date);
	}
</script>

<div class="scroll-container" use:scrollToToday>
	{#each surroundingDays as date}
		{@const isToday = date.getTime() === today.getTime()}
		{@const isSelected = date.getTime() === selectedDate.getTime()}
		{@const dateKey = getIsoKey(date)}
		{@const attendees = workoutHistory[dateKey] || []}

		<button
			type="button"
			class="day-card"
			class:today={isToday}
			class:selected={isSelected}
			onclick={() => selectDay(date)}
		>
			<span class="day-name">{getDayLabel(date)}</span>
			<span class="day-number">{getDateNumber(date)}</span>

			<div class="avatar-dots">
				{#each attendees.slice(0, 3) as buddy}
					<span class="dot" title={buddy.username}></span>
				{/each}
				{#if attendees.length > 3}
					<span class="plus-more">+{attendees.length - 3}</span>
				{/if}
			</div>
		</button>
	{/each}
</div>

<style>
	.scroll-container {
		display: flex;
		gap: 12px;
		width: 100%;
		padding: 16px 8px;
		overflow-x: auto;
		scroll-snap-type: x mandatory;
		scrollbar-width: none;
		/* Ensures smooth swiping on mobile devices */
		-webkit-overflow-scrolling: touch; 
	}

	.scroll-container::-webkit-scrollbar {
		display: none;
	}

	.day-card {
		display: flex;
		flex-direction: column;
		align-items: center;
		min-width: 65px;
		scroll-snap-align: center; /* Snaps to the center of the screen when scrolled */
		padding: 12px 6px;
		background-color: #ffffff;
		border: 1px solid #e2e8f0;
		border-radius: 12px;
		cursor: pointer;
		transition: all 0.2s ease;
	}

	.day-name {
		font-size: 0.75rem;
		color: #64748b;
		font-weight: 500;
	}

	.day-number {
		font-size: 1.15rem;
		font-weight: 700;
		color: #1e293b;
		margin: 4px 0;
	}

	/* Subtle highlight for today so it stands out even when not clicked */
	.day-card.today {
		border: 2px solid var(--color-primary, #0070f3);
		background-color: #f0f7ff;
	}

	.day-card.selected {
		background-color: var(--color-primary, #0070f3);
		border-color: var(--color-primary, #0070f3);
	}
	
	.day-card.selected .day-name,
	.day-card.selected .day-number,
	.day-card.selected .plus-more {
		color: #ffffff;
	}

	.avatar-dots {
		display: flex;
		justify-content: center;
		gap: 3px;
		height: 6px;
		margin-top: 4px;
	}

	.dot {
		width: 6px;
		height: 6px;
		background-color: #10b981;
		border-radius: 50%;
	}

	.day-card.selected .dot {
		background-color: #ffffff;
	}

	.plus-more {
		font-size: 0.55rem;
		color: #64748b;
		font-weight: 700;
	}
</style>