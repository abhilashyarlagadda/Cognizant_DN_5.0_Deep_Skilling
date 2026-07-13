import React, { useState } from "react";

function CurrencyConvertor() {

  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    // To match the lab output
    const euro = amount * 80;

    // Set the currency first
    setCurrency("Euro");

    // Show the popup after the UI updates
    setTimeout(() => {
      alert("Converting to Euro Amount is " + euro);
    }, 0);
  };

  return (
    <div>

      <h1 style={{ color: "green" }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit}>

        <label>Amount </label>

        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />

        <br /><br />

        <label>Currency </label>

        <input
          type="text"
          value={currency}
          readOnly
        />

        <br /><br />

        <button type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

export default CurrencyConvertor;