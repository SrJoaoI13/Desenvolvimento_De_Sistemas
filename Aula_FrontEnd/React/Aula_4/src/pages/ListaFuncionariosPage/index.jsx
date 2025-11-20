import { use } from 'react';
import './style.css';

export default function ListaFuncionariosPage() {
    const [funcionarios, setFuncionarios] = useState([]);
    const [carregando, setCarregando] = useState([]);

    useEffect(() => {
        async function buscarFuncionarios() {
            try{
                const resposta = await api.get('/usuarios');
                setFuncionarios(resposta.data);
            
            } catch (error) {
                console.error('Erro ao buscar funcionários:', error);
                const mensagemDoServidor = error.response?.data?.mensagem ||
                 'Erro ao buscar funcionários. Tente novamente mais tarde.';
                toast.error(mensagemDoServidor);
            } finally {
                setCarregando(false);
            }

            
        }
    return(
        <>
        
        </>
    )
}