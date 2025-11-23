import { useEffect, useState } from "react";

function DigitalClock() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const id = setInterval(() => {
      setTime(new Date());
    }, 1000);
    return () => clearInterval(id);
  }, []);

  return (
    <section className="digital-clock">
      <div>Digital Clock</div>
      <h1>{time.toLocaleTimeString()}</h1>
    </section>
  );
}

export default DigitalClock;
