import { Link } from 'react-router-dom';
import './style.css';

export default function Header() {
    return(
        <>
        <header className="header">
            <Link to="/">Senai</Link>
            <nav>
                <Link to="/cadastro">Cadastro Funcionarios</Link>
                <Link to="/funcionarios">Listar Funcionarios</Link>
            </nav>
        </header>
        </>
    )
}

