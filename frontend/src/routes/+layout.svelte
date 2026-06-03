<script lang="ts">
	import favicon from '$lib/assets/favicon.svg';
	import '../global.css';
import UserIcon from '$lib/components/UserIcon.svelte';

	let { children } = $props();
</script>

<svelte:head>
	<link rel="icon" href={favicon} />
</svelte:head>

<div class="header">
		<UserIcon username="John Doe"/>
	</div>
<div class="layout">
	{@render children()}
</div>

<style>
	.layout {
		display: flex;
        flex-direction: column;
		flex-grow: 1;
		min-height: 100vh;
		padding: 10cqw;
	}
	.header {
		display: flex;
		justify-content: flex-end;
		background-color: var(--color-primary);
		border-radius: 0 0 0 99%;
		padding: 5cqw;

	}
</style>