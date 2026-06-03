<script lang="ts">
    // This allows the button to accept text inside it, and standard button attributes (like onclick)
    let { children, ...restProps } = $props();
</script>

<button class="base-btn" {...restProps}>
    {@render children()}
</button>

<style>
    .base-btn {
        background-color: var(--color-primary);
        color: var(--color-text);
        padding: 10px 20px;
        border: none;
        border-radius: 8px;
        font-weight: bold;
        cursor: pointer;
        transition: filter 0.2s;
    }

    .base-btn:hover {
        filter: brightness(1.2);
    }
</style>