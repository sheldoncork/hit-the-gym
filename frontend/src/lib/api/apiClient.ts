import { PUBLIC_BACKEND_URL } from '$env/static/public';

export default async function apiFetch<T>(endpoint: string, options: RequestInit = {}): Promise<T> {
    const url = `${PUBLIC_BACKEND_URL}${endpoint}`;

    const defaultHeaders = {
        'Content-Type': 'application/json'
    };

    const response = await fetch(url, {
        ...options,
        headers: {
            ...defaultHeaders,
            ...options.headers,
        }
    });

    if (!response.ok) {
        throw new Error(`API request failed: ${response.status} ${response.statusText}`);
    }

    return response.json() as Promise<T>;
}