import './style.css';
import { useState } from 'react';

export default function Aluno() {
    const [nome, setNome] = useState('João Vítor');
    const [email, setEmail] = useState('Joãoítor@gmail.com');
    const [cpf, setCPF] = useState('852.963.741-58');
    return (
        <dev>
            <h2>Informações de Cadastrado</h2>
            <p><strong>Nome: </strong>{nome}</p>
            <p><strong>Email: </strong>{email}</p>
            <p><strong>CPF: </strong>{cpf}</p>
        </dev>
    )
}