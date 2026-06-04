<script lang="ts">
	import favicon from '$lib/assets/favicon.svg';
	import '../global.css';
import UserIcon from '$lib/components/UserIcon.svelte';
import NavigationButton from '$lib/components/NavigationButton.svelte';

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
		<table>
			<tbody>
				<tr>
					<td><NavigationButton href="/">Home</NavigationButton></td>
					<td><NavigationButton href="/addExercise">Add Exercise</NavigationButton></td>
				</tr>
			</tbody>
			
		</table>
	</footer>
</div>
	
<style>
	.app-container {
		display: flex;
		flex-direction: column;
		min-height: 100vh;
	}
	main {
		display: flex;
        flex-direction: column;
		flex-grow: 1;
		min-height: 10vh;
		padding: 10cqw;
	}
	footer {
		display: flex;
		justify-content: flex-end;
		background-color: var(--color-primary);
		padding: 5cqw;
	}
	table {
		width: 100%;
	}
	header {
		display: flex;
		justify-content: space-between;
		align-items: center;
		background-color: var(--color-primary);
		padding: 5cqw;
	}
</style>