function Header({title, handleHeaderClick, count}) {

  return (
    <>
      <h1 onClick={handleHeaderClick}>This is counter header and the count is {count} and the title is {title} raj</h1>
    </>
  )
}

export default Header
