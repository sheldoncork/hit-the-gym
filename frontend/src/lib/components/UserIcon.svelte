<script lang="ts">
interface Props {
    avatarUrl?: string;
    username: string;
}

let {
    username,
    avatarUrl = 'https://ui-avatars.com/api/?name=' + encodeURIComponent(username) + '&background=fff&size=128'
}: Props = $props();
</script>

<img src={avatarUrl} alt="{username}'s Avatar" />

<style>
img {
    width: 50px;
    height: 50px;
    border-radius: 10%;
}
</style>