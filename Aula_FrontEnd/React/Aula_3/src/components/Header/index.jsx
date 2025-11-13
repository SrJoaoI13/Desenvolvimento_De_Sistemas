import { NavLink } from 'react-router-dom';
import './style.css'
import logo from '../../assets/contabilidade.webp';

export default function Header() {
    return (
        <header className="header">
            <img src={logo} alt="Logo da Contabilidade" />
            <span>Contabilidade Simples</span>
            
            <nav className='nav'>
                <NavLink to="/sobre-nos">Sobre nós</NavLink>
                <NavLink to="/fale-conosco">Fale conosco</NavLink>
            </nav>
        </header>
    );
}
