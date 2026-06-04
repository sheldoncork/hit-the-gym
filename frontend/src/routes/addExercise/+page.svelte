<script lang="ts">
import UserIcon from '$lib/components/UserIcon.svelte';
import logEntry from '$lib/logEntry';

interface Row {
    name: string;
    inputType?: string;
}

let a: Row = {name: "Exercise", inputType: "text"};
let b: Row = {name: "Sets", inputType: "number"};
let c: Row = {name: "Reps", inputType: "number"};

let rows: Row[] = [a, b, c];
</script>

<div class="container">
    <h2 class="title">Add Exercise</h2>
    <form onsubmit={null}>
       
    
        <!-- Fed from database as dropdown with option -->
                
        {#each rows as row}
             <label for={row.name}>{row.name}</label>
             {#if row.inputType === "number"}
                <input type="number" id={row.name} name={row.name} min="0" required />
             {:else}
                <input type="text" id={row.name} name={row.name} required />
             {/if}
        {/each}

        <p>
            <button style="font-size:100%;">Add Exercise</button>
        </p>
    </form>
</div>


<style>
    .container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
    .title {
        display: flex;
        justify-content: center;
        color: var(--color-text);
    }

    form {
        display: flex;
        flex-direction: column;
        grid-template-columns: repeat(2, 1fr);
        align-items: center; /* This ensures the text aligns perfectly with the middle of the text boxes */
        justify-content: center;
        width: 100%;
        max-width: 90vh;
    }
    
    label {
        padding-top: 3vh;
        text-align: center;
        font-weight: bold;
        color: var(--color-text); /* Use your global colors! */
    }

    /* 1. Target the text boxes to make them look modern */
    input {
        padding-bottom: 3vh;
        border: 2px solid var(--color-surface);
        background-color: var(--color-tertiary); 
        color: var(--color-text);
        font-size: 1rem;
        padding: 0.5rem 1rem;
        outline: none;
        transition: border-color 0.2s ease;
    }

    /* 2. Add a glow effect when the user taps on the input */
    input:focus {
        border-color: var(--color-primary); 
    }

    /* 3. Make the submit button span all the way across the bottom */
    form > :global(button), form > :global(a) {
        grid-column: span 2; 
        margin-top: 10px;
    }
</style>