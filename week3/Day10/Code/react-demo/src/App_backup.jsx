import { useEffect, useState } from 'react'
import Header from './components/Header/index.jsx'
import './App.css'

function App() {
  const [count1, setCount1] = useState(0);
  const [count2, setCount2] = useState(0);
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(false);
  const handleClick1 = () => {
    setCount1(count1 + 1);
  };
  const handleClick2 = () => {
    setCount2(count2 + 1);
  };
  const handleFetchData = () => {
    setLoading(true);
    fetch('https://fakestoreapi.com/products')
      .then(response => response.json())
      .then(json => {
        setLoading(false);
        setData(json);
      });
  };

  useEffect(() => {
    setTimeout(() => {
      handleFetchData();
    }, 1000);
  }, []);

  return (
    <>
      {/* <Header title={count.title} count={count.count} handleHeaderClick={handleHeaderClick} /> */}
      <h1>Count 1: {count1}</h1>
      <h1>Count 2: {count2}</h1>
      <button onClick={handleClick1}>Click 1</button>
      <button onClick={handleClick2}>Click 2</button>
      {loading ? <div>Loading...</div> : data.map(item => (
        <div key={item.id}>
          <h1>{item.title}</h1>
          <p>{item.description}</p>
          <p>{item.price}</p>
        </div>
      ))}
    </>
  )
}

export default App
