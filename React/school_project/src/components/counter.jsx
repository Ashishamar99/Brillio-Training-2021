import React from 'react';
import {useState} from 'react';
import "../css/counter.css";

export const Counter = () => {

    const f1 = () => {
        if(num == 0) return "blue"
        else if(num > 0) return "green"
        else if(num < 0) return "red"
    }

    let [num, setNum] = useState(0);

    return (
        <div>
            <div className="container">
                <div className="inner-container">
                    <h1>Counter</h1>
                </div>

                <div className="inner-container">
                    <div className={f1()}>{num}</div>
                    <br />
                    <button onClick={
                        () => setNum(num - 1)
                    }
                    >Decrease</button>
                    
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    
                    <button onClick={
                        () => setNum(num + 1)
                    }
                    >Increase</button>

                </div>
        </div>
        </div>
    )
}
