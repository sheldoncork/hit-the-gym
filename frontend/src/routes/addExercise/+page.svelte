<script lang="ts">
import UserIcon from '$lib/components/UserIcon.svelte';
import logEntry from '$lib/logEntry';
</script>

<div class = "screen">
    <button onclick={() => logEntry}>Log Entry</button>
    <UserIcon username="John Doe" />
</div>

<style>
    .screen {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
</style>