import { useParams } from "react-router-dom";

function HomeChild() {

  const { testChild } = useParams();

  return (
    <>
      This is home child page {testChild}
    </>
  )
}

export default HomeChild
