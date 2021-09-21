import React from 'react'
import "../css/main.css";
import { useState } from 'react';

//rafc component
export const Subtracttwonumbers = () => {

    let [num1, setNum1] = useState(0);
    let [num2, setNum2] = useState(0);
    let [num3, setNum3] = useState(0);

    let calculate = () => {
        setNum3(num1 - num2);
    }

    return (
        <div>
        <div>
            <div className="container">
                <div className="inner-container">
                    <h1>Subtraction of 2 Nos</h1>

                    <div className="inner-container">
                        <form>
                            <label for="num1">Enter Number 1:: </label>
                            <input type="number" id="num1" name="num1" onChange={(e) => {setNum1(e.target.value);}}/>

                            <br />
                            <label for="num2">Enter Number 2:: </label>
                            <input type="number" id="num2" name="num2" onChange={(e) => {setNum2(e.target.value);}}/>
                            <br />

                            <label for="num3">Result:: </label>
                            <input type="number" id="num3" name="num3" value={num3}/>
                            <br />
                            
                            <input type="button" value="Calculate" onClick={calculate}/>

                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
        </div>
    )
}