import React, { useState } from "react";
import Main_Nav from "../components/home_nav";

const Feedback = () => {
  const [ename, setEName] = useState("");
  const [review, setReview] = useState("");

  // const navigate = useNavigate();

  // const onButtonClick = () => {
  //     // You'll update this function later...
  // }

  return (
    <>
      <Main_Nav />
      <div className="text_container">
        <h1 className="no_video_text_feed">Send us your Valuable Feedback!</h1>
      </div>
      <div>
        <div className={"mainContainer"}>
          <div className={"titleContainer"}>
            <div>Feedback form</div>
          </div>
          <br />
          <div className={"inputContainer"}>
            <input
              value={ename}
              type="text"
              placeholder="Enter the Event's Name"
              onChange={(ev) => setEName(ev.target.value)}
              className={"inputBox"}
            />
            {/* <label className="errorLabel">{emailError}</label> */}
          </div>
          <br />
          <div className={"inputContainer"}>
            <input
              value={review}
              type="text"
              placeholder="Enter your Feedback here..."
              onChange={(ev) => setReview(ev.target.value)}
              className={"inputBox_Feed"}
            />
            {/* <label className="errorLabel">{emailError}</label> */}
          </div>
          <br />
          <div className={"inputContainer"}>
            <input
              className={"inputButton"}
              type="button"
              // onClick={onButtonClick}
              value={"Send Review"}
            />
          </div>
        </div>
      </div>
    </>
  );
};
export default Feedback;
