import apiFetch from './apiClient';
import type Row from '$lib/models/Row';
import type Exercise from '$lib/models/Exercise';

async function getWorkouts(user: string): Promise<any> {
    return apiFetch(`/workouts?user=${encodeURIComponent(user)}`);
}

async function getExerciseFields(): Promise<Row[]> {
    return apiFetch<Row[]>(`/exerciseFields`);
}

async function getExercise(): Promise<Exercise> {
    return apiFetch<Exercise>(`/exercise`);
}

export { getWorkouts, getExerciseFields, getExercise };