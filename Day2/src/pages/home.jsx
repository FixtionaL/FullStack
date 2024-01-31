import React from 'react'
import Main_Nav from '../components/home_nav';
import videoBg from '../assets/sample_2.mp4'

const Home = () => {
  return (
    <>
      <div className='main'>
        <Main_Nav></Main_Nav>
        <div className="overlay"></div>
        <video src={videoBg} autoPlay loop muted />
        {/* <div className="content"> */}
          {/* <div className="land_nav"> */}
          {/* </div> */}
          <h1 className="land_text">
          This is the Home Page for this application! It contains the Main Navbar and rest to be added components!
          </h1>
        {/* </div> */}
    </div>
    </>
  )
};
export default Home


