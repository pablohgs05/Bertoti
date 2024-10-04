async function loadProdutos() {
    try {
        const response = await fetch('http://localhost:8080/produtos');
        const produtos = await response.json();
        const produtosTable = document.getElementById('produtos-table');
        produtosTable.innerHTML = '';

        produtos.forEach(produto => {
            const row = `
                <tr>
                    <td>${produto.id}</td>
                    <td>${produto.nome}</td>
                    <td>${produto.preco}</td>
                </tr>
            `;
            produtosTable.innerHTML += row;
        });
    } catch (error) {
        console.error('Erro ao carregar os produtos:', error);
    }
}


async function addProduto(event) {
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const preco = document.getElementById('preco').value;

    const novoProduto = {
        nome: nome,
        preco: parseFloat(preco)
    };

    try {
        const response = await fetch('http://localhost:8080/produtos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(novoProduto)
        });

        if (response.ok) {

            loadProdutos();

            document.getElementById('produto-form').reset();
        } else {
            console.error('Erro ao adicionar produto:', response.statusText);
        }
    } catch (error) {
        console.error('Erro ao adicionar produto:', error);
    }
}


window.onload = () => {
    loadProdutos();


    const form = document.getElementById('produto-form');
    form.addEventListener('submit', addProduto);
};
