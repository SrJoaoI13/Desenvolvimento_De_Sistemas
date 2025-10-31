import './App.css'
import Aluno from './components/Aluno'
import { InfoCurso } from './components/InfoCurso'
import Mensagem from './components/Mensagem'

function App() {
  

  return (
    // HTML 
    <>
      <h1>Dev João Vítor</h1>
      <h5>Socorro Deus</h5>
      <Mensagem />
      <InfoCurso />
      <Aluno />
    </>
  )
}

export default App
