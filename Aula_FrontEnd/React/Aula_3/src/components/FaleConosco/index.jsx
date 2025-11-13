import './style.css'

export default function FaleConosco() {
    function handleSubmit(event) {
        event.preventDefault();
        alert("Mensagem enviada com sucesso.");
    }

    return (
    <section>
        <h1>Fale conosco</h1>
        <p>Tire dúvidas e peça um orçamento sem compromisso</p>

        <form className='form' onSubmit={handleSubmit}>
            <div className='campo'>
                    <label>
                        <span>Nome</span>
                        <input type="text" required placeholder='Seu nome' />
                    </label>

                    <label>
                        <span>E-mail</span>
                        <input type="email" required placeholder='Seu e-mail' />
                    </label>

                    <label>
                        <span>Telefone</span>
                        <input type="tel" required placeholder='(00) 99999-9999 ' />
                    </label>
            </div>

                <label>
                        <span>Assunto</span>
                        <input type="text" required placeholder='Ex.: Abertura de empresa' />
                </label>

               <label>
                    <span>Mensagens</span>
                    <input type="text" required placeholder='Conte-nos um pouco do seu caso' />
                </label>
            </form>
    </section>
    );
}
