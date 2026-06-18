<script lang="ts">
	import UserIcon from '$lib/components/UserIcon.svelte';
	import DailyUser from '$lib/components/DailyUsers.svelte';
	import {currentDayLabel} from '$lib/date';
	import DailyUsers from '$lib/components/DailyUsers.svelte';
</script>

<h1>{currentDayLabel}</h1>
<div class="dashboard-layout">
    <!-- Thinking here we will have icons for each user with the latest ones first -->
	 <!-- Bubble User Icons in a space -->
	  <DailyUsers />
</div>

<!-- https://excalidraw.com/#room=5f510c2882073269fd6f,Xj8scV2_syew_b_TI2wBQA -->

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