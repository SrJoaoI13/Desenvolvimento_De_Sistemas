import { Routes, Route } from 'react-router-dom'
import './App.css'
import Header from './components/Header'
import Home from './components/Home'
import SobreNos from './components/SobreNos'
import FaleConosco from './components/FaleConosco'
import Footer from './components/Footer'

function App() {
  

  return (
   
  <div className='app'>
    <Header></Header>
    <main>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/' element={<SobreNos/>}/>
        <Route path='/' element={<FaleConosco/>}/>
      </Routes>
    </main>
    <Footer/>
    </div>
  )
}

export default App
