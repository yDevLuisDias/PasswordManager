<script setup>
    import { ref } from 'vue';

    const title = ref('')
    const site = ref('')
    const password = ref('')
    const msg = ref('')

    function resetForum(){
    
        title.value = ''
        site.value = ''
        password.value = ''
    
        msg.value = "Salvo com sucesso!"
       
    }

                </div>
</script>

<template>
    <div class="container">
        <label class="input-title">
            Title :
            <input type="text" v-model="title" />
        </label>

        <label class="input-site">
            Site :
            <input type="text" v-model="site">
        </label>

        <label class="input-password">
            Password :
            <input type="text" v-model="password">
        </label>

        <button @click="resetForum"> salvar! </button>
        <p>{{ msg }}</p>

    </div>

    <div class="resultados">
        <p> Titulo : {{ title }}</p>
        <p> Site : {{ site }}</p>
        <p> Password : {{ password }}</p>

    </div>
</template>

<style scoped></style>
