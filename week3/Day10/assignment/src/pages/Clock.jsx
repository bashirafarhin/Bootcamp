import { useState } from "react";

function Clock() {
  const [count, setCount] = useState(() => {
    console.log("Initial count set to 0");
    return 0;
  });

  return (
    <section className="clock">
      <div>Counter</div>
      <h1>{count}</h1>
      <div>
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setCount(count - 1)}>Decrement</button>
      </div>
    </section>
  );
}

export default Clock;
