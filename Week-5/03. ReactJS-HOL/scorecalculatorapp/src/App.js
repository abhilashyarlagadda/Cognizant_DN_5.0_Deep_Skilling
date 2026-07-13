import { CalculateScore } from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Abhilash"
        School="ZP High School"
        total={570}
        goal={6}
      />
    </div>
  );
}

export default App;