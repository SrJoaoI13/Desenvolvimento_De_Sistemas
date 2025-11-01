import { useState } from 'react'
import './style.css'

export default function AdicionarAluno() {
    // Criando e inicializando as variáveis 
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')

    // Criando uma lista para adionar os nomes dedos alunos
    const [listaAlunos, setListaAlunos] = useState([])

    // Função para adicionar aluno na lista
    const addAluno = (event) => {
        // Evita que a pagina seja recarregada ao enviar o formulário
        event.preventDefault()
        if (nome && email) {
            //Adiciona os dados anteriores mais os novos dados na lista
            setListaAlunos([...listaAlunos, { nome: nome, email: email }])

            //Define os valores iniciais dos campos como vazios
            setNome('')
            setEmail('')
        }
    } // 👈 apenas fechando a função aqui

    //HTML
    return (
        <div>
            <h2>Adicionar Aluno</h2>
            <form onSubmit={addAluno}>
                <input
                    type='text'
                    placeholder='Nome do Aluno'
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}
                   
                />
                <input
                    type='email'
                    placeholder='Email do Aluno'
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
                <button type='submit'>Adicionar</button>
            </form>
            <hr />

    <h3>Matriculados</h3>
            <ul>
                {listaAlunos.map((aluno, index) => (
                    <li key={index}>{aluno.nome} - {aluno.email}</li>
                ))}
            </ul>
        </div>
    )
}
