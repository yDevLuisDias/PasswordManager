<template>
    <main class="home-container">

        <section class="nav-bar">
            <div class="nav-content">
                <li><a href="#">Home</a></li>
                <li><a href="#">Gerenciador</a></li>
            </div>
        </section>

        <header class="header">
            <div class="title-card">
                <h1>Password Manager</h1>
                <p class="subtitle">UM GERENCIADOR DE SENHAS PRÁTICO!</p>
            </div>

        </header>
        
        <section class="cards-section">
            <div class="card card-large">
                <div class="card-content">
                   Card Principal
                </div>
            </div>

            <div class="card card-small">
                <div class="card-content">
                   Card 1
                </div>
            </div>

            <div class="card card-small">
                <div class="card-content">
                    Card 2
                </div>
            </div>

        </section>
        
        <footer class="footer">
            <span>footer</span>
        </footer>
    </main>
</template>

<script>
export default {
    name: 'Home',
}
</script>

<style scoped>

    /* Barra de navegação  */

.nav-bar {
    position: fixed;
    top: 0;
    left: 50%;
    transform: translateX(-50%);
    z-index: 1000;

    display: flex;
    justify-content: center;
    padding: 1rem 2rem;
    width: 30%;

    background: rgba(255, 255, 255, 0.1);
    backdrop-filter: blur(10px);
    border-bottom: 1px solid rgba(255, 255, 255, 0.1);
    border-radius: 0 0 1rem 1rem;
}

.nav-content {
    display: flex;
    gap: 2rem;
    list-style: none;
    margin: 0;
    padding: 0;
}

.nav-content li {
    list-style: none;
}

.nav-content a {
    color: rgba(255, 255, 255, 0.9);
    text-decoration: none;
    font-size: 1rem;
    font-weight: 500;
    transition: color 0.3s ease;
}

.nav-content a:hover {
    color: #ffffff;
}

    /* Container principal */

.home-container {
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    padding: 3rem;
    padding-top: 0.5rem;
    background: #2c2c2c;
    box-sizing: border-box;
}

.header {
    display: flex;
    justify-content: center;
    margin-bottom: 4rem;
    margin-top: 1.5rem;
}

.title-card {
    backdrop-filter: blur(10px);
    border-radius: 1.5rem;
    padding: 2rem 3rem;
    text-align: center;
}

h1 {
    color: #ffffff;
    font-size: 5rem;
    font-weight: 300;
    margin: 0 0 0 0;
    text-transform: uppercase;
    font-family: 'Times New Roman', serif;
    letter-spacing: 2px;
}

.subtitle {
    color: rgba(255, 255, 255, 0.8);
    font-size: 0.9rem;
    margin: 0;
    letter-spacing: 1px;
    font-weight: 400;
}

    /* Seção de cartões */

.cards-section {
    display: grid;
    grid-template-columns: 3fr 2fr;
    grid-template-rows: 2fr 3fr;
    gap: 1.5rem 5rem;
    flex: 1;
    max-width: 90%;
    margin: 0 auto 5rem auto;
    width: 100%;
    height: 400px;
}

.card {
    background: #d3d3d3;
    border-radius: 0.5rem;
    display: flex;
    align-items: center;
    justify-content: center;
}

.card-large {
    grid-row: 1 / 3;
    grid-column: 2;
    max-width: 400px;
    margin-left: 10rem;
}

.card-small {
    grid-column: 1;
}

.card-content {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #666;
    font-size: 0.9rem;
}

    /* Rodapé */

.footer {
    position: fixed;
    bottom: 0;
    left: 0;
    right: 0;
    width: 100%;
    z-index: 1000;

    display: flex;
    justify-content: center;
    background: rgba(255, 255, 255, 0.05);
    backdrop-filter: blur(10px);
    border-top: 1px solid rgba(255, 255, 255, 0.1);
    padding: 1rem 0;
}

.footer span {
    background: rgba(255, 255, 255, 0.1);
    color: rgba(255, 255, 255, 0.7);
    padding: 0.8rem 1.5rem;
    border-radius: 0.5rem;
    font-size: 0.9rem;
}

    /* Media Queries - Responsividade */

@media (max-width: 768px) {
    .nav-content {
        gap: 1rem;
    }
    
    .nav-content a {
        font-size: 0.9rem;
    }
    
    .cards-section {
        grid-template-columns: 1fr;
        grid-template-rows: auto auto auto;
        height: auto;
    }
    
    .card-large {
        grid-row: 1;
        grid-column: 1;
        height: 200px;
    }
    
    .card-small {
        grid-column: 1;
        height: 150px;
    }
    
    h1 {
        font-size: 2.2rem;
    }
    
    .title-card {
        padding: 1.5rem 2rem;
    }
}
</style>
