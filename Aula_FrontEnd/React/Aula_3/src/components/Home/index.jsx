import './style.css'
import { Link } from 'react-router-dom'; 
import logo from '../../assets/contabilidade.webp';
import equipe from '../../assets/equipe.png';

export default function Home() {
    return (
        <div className='home'>
            <section className='logo'>
                <h1>Contabilidade descomplicada para seu negócio</h1>
                <p>
                    Economize tempo e foque no que importa.
                    Cuidamos de folhas de pagamentos, impostos e obrigações com tecnologia e atendimento humano.
                </p>

                <div>
                    <Link to="/fale-conosco">Fale com um especialista</Link> 
                </div>

                <div>
                    <img src={logo} alt="Logo da empresa" /> 
                </div>
            </section>

            <section>
                <h2>Por que nos escolher?</h2>

                <div>
                    <div className='card'>
                        <h3>Atendimento próximo</h3>
                        <p>Suporte rápido por WhatsApp, e-mail e reuniões online sempre que precisar.</p>
                    </div>

                    <div>
                        <h3>Tecnologia</h3>
                        <p>Interações com bancos e plataformas para automatizar lançamentos e reduzir erros.</p>
                    </div>

                    <div>
                        <h3>Planejamento tributário</h3>
                        <p>Escolha do regime ideal e estratégias legais para pagar menos impostos.</p>
                    </div>
                </div>
            </section>

            <section>
                <div>
                    <img src={equipe} alt="Equipe de contabilidade" /> 
                </div>
                <div>
                    <h2>Mais de 200 empresas atendidas</h2>
                    <p>
                        Incluindo as pequenas e médias empresas em todo o Brasil.
                        Cases em comércio, serviços e tecnologias.
                    </p>
                </div>
            </section>
        </div>
    );
}
