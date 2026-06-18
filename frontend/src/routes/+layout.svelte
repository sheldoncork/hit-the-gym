<script lang="ts">
	import favicon from '$lib/assets/favicon.svg';
	import '../global.css';
	import UserIcon from '$lib/components/UserIcon.svelte';

	let { children } = $props();
</script>

<svelte:head>
	<link rel="icon" href={favicon} />
</svelte:head>


<div class="app-container">
	<header>
		<h1>Hit the Gym</h1>
		<UserIcon username="Big P"/>
	</header>

	<main>
	{@render children()}
	</main>

	<footer>
		<nav>
			<a class="navbar_btn" href="/">Home</a>
			<a class="navbar_btn" href="/addExercise">Add Exercise</a>
		</nav>
	</footer>
</div>
	
<style>
	.navbar_btn {
		font-size: 125%
	}
	.app-container {
		display: flex;
		flex-direction: column;
		min-height: 100vh;
	}
	main {
		display: flex;
        flex-direction: column;
		box-sizing: border-box;
		flex-grow: 1;
	}
	nav {
		display: grid;
		grid-template-columns: 1fr 1fr;
		justify-content: space-evenly;
		background-color: var(--color-primary);
		gap: 1cqw;
		padding: 1cqw;
		min-height: 10vh;
	}
	header {
		position: sticky;
		top: 0;
		z-index: 10;
		display: flex;
		justify-content: space-between;
		align-items: center;
		background-color: var(--color-primary);
		padding: 1cqw;
	}
	footer {
		position: sticky;
		bottom: 0;
		z-index: 10;
	}

</style>