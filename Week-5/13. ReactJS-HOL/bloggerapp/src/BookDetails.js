function BookDetails({ books }) {
  return (
    <>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </>
  );
}

export default BookDetails;