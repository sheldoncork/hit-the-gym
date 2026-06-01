<script lang="ts">
import {PUBLIC_BACKEND_URL} from '$env/static/public';

interface LogEntry {
    type: string;
    timestamp: string;
}

async function logEntry(type: string) {
    console.log(`Logging ${type} entry`);
    const response = await fetch(`${PUBLIC_BACKEND_URL}/log`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ type })
    });
}
</script>

<div class = "screen">
    <button onclick={() => logEntry}>Log Entry</button>
</div>

<style>
    .screen {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
</style>