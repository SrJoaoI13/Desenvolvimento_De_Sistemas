import { use, useState } from 'react';
import './style.css';

export function InfoCurso() {
    // Criando variaveis
    // useState é uma função do ReactJS
    // Tambem chamada de Hook
    const[nome, setNome] = useState('Desenvolvimento de Sistemas Web');
    const[cargaHoraria, setCargaHoraria] = useState('158 Horas');
    const[local, setlocal] = useState('Infernai');
return (
    <div className='info-curso'>
        <h2>Dados do curso</h2>
        <p><strong>Nome:</strong> {nome}</p>
        <p><strong>Carga horaria:</strong> {cargaHoraria}</p>
          <p><strong>Local:</strong> {local}</p>
    </div>

)

}