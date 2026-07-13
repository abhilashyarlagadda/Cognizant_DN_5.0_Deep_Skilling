import office from "./office.png";

function App() {

  const officeData = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const rentStyle = {
    color: officeData.Rent <= 60000 ? "red" : "green"
  };

  return (
    <div style={{ marginLeft: "100px", marginTop: "40px" }}>

      <h1>Office Space , at Affordable Range</h1>

      <img
        src={office}
        alt="Office Space"
        width="220"
        height="220"
      />

      <h1>Name: {officeData.Name}</h1>

      <h3 style={rentStyle}>
        Rent: Rs. {officeData.Rent}
      </h3>

      <h3>
        Address: {officeData.Address}
      </h3>

    </div>
  );
}

export default App;