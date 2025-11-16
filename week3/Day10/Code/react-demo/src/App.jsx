import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Pages/Home';
import HomeChild from './Pages/HomeChild';
import About from './Pages/About';
import './App.css'

function App() {

  return (
    <>
      <Router>
        <nav>
          <Link to="/">Home</Link>
          <Link to={{
            pathname: '/about',
            search: '?name=John',
          }}>About</Link>
        </nav>
        <Routes>
          <Route path="/home" element={<Home />}>
            <Route index element={<HomeChild />} />
            <Route path="child2/:testChild?" element={<HomeChild />} />
          </Route>
          <Route path="/about" element={<About />} />
          <Route path="*" element={<div>404 Not Found</div>} />
        </Routes>
      </Router>
    </>
  )
}

export default App
