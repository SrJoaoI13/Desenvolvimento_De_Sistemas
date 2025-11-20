import './style.css';
import * as yup from 'yup';
import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import { toast } from 'react-toastify';
import api from '../../services/api';


const esquemaCadastro = yup.object({
    nome: yup.string().required("O nome é obrigatório"),
    email: yup.string().email("Digite um email válido").required("O email é obrigatório"),
    senha: yup.string().min(6, "A senha deve ter no mínimo 6 caracteres")
    .required("A senha é obrigatória"),
})

export default function CadastroPage() {
    const{
        register: registrarCompo,
        handleSubmit: lidarComEnvioDoFormulario,
        formState: { errors: errosDoFormulario, isSubmitting: estaEnviando },
    reset: limparcomposDoFormulario,
    } = useForm({
        resolver: esquemaCadastro, 
        defaultValues: {
            nome: '',
            email: '',
            senha: '',
        },
    });

    async function enviarDados(dadosDoFormulario){
        const dadosParaEnviar = {
            nome: dadosDoFormulario.nome,
            email: dadosDoFormulario.email,
            senha: dadosDoFormulario.senha,
        };

        try{
            const resposta = await api.post('/users', dadosParaEnviar);
            toast.success(resposta.data.mensagem ||'Funcionário cadastrado com sucesso!');
            limparcomposDoFormulario();
        } catch (error){
     const codidoDeStatus = error.response?.status;
     const mensagemDoServidor = error.response?.data?.mensagem; || 'Erro ao cadastrar funcionário. Tente novamente mais tarde.';

        if(codidoDeStatus === 400){
            definirErroFormulario('email', {
                type: 'server',
                message: mensagemDoServidor,
            });
        } else {
            toast.error(mensagemDoServidor);
            console.error('Erro ao cadastrar funcionário:', error);
        }
            ;
    }

}
    return(
        <>
        <div className='cadastro-page'>
        <h2>Cadastro de Funcionário</h2>
        <form noValidate onSubmit={lidarComEnvioDoFormulario(enviarDados)}>
            {/* Nome */}
            <div className='form-group'>
                <label htmlFor='nome'>Nome:</label>
                <input 
                type="text" 
                id="nome" 
                placeholder='Ex.: João Silva'
                {...registrarCompo('nome')} 
                />
            </div>
             {errosDoFormulario.nome && (
                    <span className='error-message'>{errosDoFormulario.nome.message}</span>
                )}
                {/* Email */}
            <div className='form-group'>
                <label htmlFor='email'>Email:</label>
                <input 
                type="email" 
                id="email" 
                placeholder='Ex.: exemplo@email.com '
                {...registrarCompo('email')} 
                />
            </div>
                {errosDoFormulario.email && ( 
                    <span className='error-message'>{errosDoFormulario.email.message}</span>
                )}      
                {/* Senha */}
            <div className='form-group'>
                <label htmlFor='senha'>Senha:</label>
                <input 
                type="password" 
                id="senha" 
                placeholder='Digite sua senha'
                {...registrarCompo('senha')} 
                />
            </div>
                {errosDoFormulario.senha && (
                    <span className='error-message'>{errosDoFormulario.senha.message}</span>
                )}  
                {/* Botão de Envia */}
                <button type="submit" disabled={estaEnviando}>
                    {estaEnviando ? 'Cadastrando...' : 'Cadastrar Funcionário'}
                </button>
        </form>

        </div>
        </>
    )


}