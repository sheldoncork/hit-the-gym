<script lang="ts">
	import {currentDayLabel} from '$lib/date';
	import ScrollerDayPicker from '$lib/components/ScrollerDayPicker.svelte';
</script>

<h1>{currentDayLabel}</h1>
<ScrollerDayPicker/>
<div class="dashboard-layout">
    <!-- Thinking here we will have icons for each user with the latest ones first -->
</div>

<style>
    .dashboard-layout {
		display: flex;
		flex-direction: row; /* Horizontal tracking */
		gap: 16px;
		width: 100%;
		max-width: 800px;
		margin: 0 auto;
		padding: 12px;
	}
    /* Responsive break point adjustment for mobile layouts */
	@media (max-width: 600px) {
		.dashboard-layout {
			flex-direction: column; /* Stack vertically on small phone displays */
		}
	}
</style>