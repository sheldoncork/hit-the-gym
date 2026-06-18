import apiFetch from './apiClient';
import type Row from '$lib/models/Row';

async function getWorkouts(user: string): Promise<any> {
    return apiFetch(`/workouts?user=${encodeURIComponent(user)}`);
}

async function getExerciseFields(): Promise<Row[]> {
    return apiFetch<Row[]>(`/exerciseFields`);
}

export { getWorkouts, getExerciseFields };