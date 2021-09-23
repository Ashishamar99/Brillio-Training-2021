/////////////////////////////////////////////////////////////////////////////////////////////////////
//CONVERTING A rafc COMPONENT TO A cc COMPONENT FOR THE INSTANCE TEST CASES TO PASS.

import React, { Component } from "react";
import { useState } from "react";
import "../css/counter.css";
import ReusableButtonProps from "./reusablebuttonprops";

export default class Counter extends Component {
    state = {
        num: 0,
    };

    f1 = () => {
        if (this.state.num === 0) return "blue";
        else if (this.state.num < 0) return "red";
        else return "green";
    };
    
    incCount = () => {
        this.setState({ num: this.state.num + 1 });
    };
    
    decCount = () => {
        this.setState({ num: this.state.num - 1 });
    };
    
    render() {
        return (
        <div>
            <div className={this.f1()}>{this.state.num}</div>
            <ReusableButtonProps handleClick={this.incCount} value="Increase" />
            <ReusableButtonProps handleClick={this.decCount} value="Decrease" />
        </div>
    );
    }
}



/////////////////////////////////////////////////////////////////////////////////////////////////////
// import React from 'react';
// import {useState} from 'react';
// import "../css/counter.css";
// import ReusableButtonProps from './reusablebuttonprops';

// const Counter = () => {

//     const incCount = () => {
//         setNum(num + 1)
//     }

//     const decCount = () => {
//         setNum(num - 1)
//     }


//     const f1 = () => {
//         if(num === 0) return "blue"
//         else if(num > 0) return "green"
//         else if(num < 0) return "red"
//     }

//     let [num, setNum] = useState(0);

//     return (
//         <div>
//             <div className="container">
//                 <div className="inner-container">
//                     <h1>Counter</h1>
//                 </div>

//                 <div className="inner-container">
//                     <div className={f1()}>{num}</div>
//                     <br />
                    
//                     {/* IMPLEMENTING THE BELOW COMMENTED BUTTONS USING PROPS */}

//                     <ReusableButtonProps handleClick={incCount} value="Increase Count"/>
//                     <ReusableButtonProps handleClick={decCount} value="Decrease Count"/>

//                     {/*                     
//                     <button onClick={
//                         () => setNum(num - 1)
//                     }
//                     >Decrease</button>
                    
//                     &nbsp;&nbsp;&nbsp;&nbsp;
                    
//                     <button onClick={
//                         () => setNum(num + 1)
//                     }
//                     >Increase</button> */}

//                 </div>
//         </div>
//         </div>
//     )
// }

// //FOR THE TEST CASE TO WORK EITHER cc SHOULD HAVE A DEFAULT EXPORT OR USE AN rfce. 
// export default Counter;