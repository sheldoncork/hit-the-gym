<script lang="ts">
    // We explicitly extract 'href' from the props to check if it exists
    let { href, children, ...restProps } = $props();
</script>

{#if href}
    <a {href} class="base-btn" {...restProps}>
        {@render children()}
    </a>

{:else}
    <button class="base-btn" {...restProps}>
        {@render children()}
    </button>
{/if}

<style>
    .base-btn {
        display: inline-block;
        background-color: var(--color-secondary);
        color: var(--color-text);
        padding: 10px 20px;
        border: none;
        border-radius: 8px;
        font-weight: bold;
        cursor: pointer;
        text-decoration: none; 
        transition: filter 0.2s;
    }

    .base-btn:hover {
        filter: brightness(1.2);
    }
</style>