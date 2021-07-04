// import "App.css";

export default function App() {
  const value = 1;
  return (
    <div className="App">
     {
      (function() {
         if (value === 1) return <div>1이다!</div>
         if (value === 2) return <div>2다!</div>
         if (value === 3) return <div>3이다!</div>
        return <div>없다</div>
      })()
     }
     
    </div>
  );
}