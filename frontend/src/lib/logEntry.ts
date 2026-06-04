import {PUBLIC_BACKEND_URL} from '$env/static/public';

interface LogEntry {
    type: string;
    timestamp: string;
}

async function logEntry(entry: LogEntry): Promise<void> {
    console.log(`Logging ${type} entry`);
    const response = await fetch(`${PUBLIC_BACKEND_URL}/log`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ type })
    });
}

export default { logEntry };