import React from 'react';
import {useState} from 'react';

export const Multiplicationtables = () => {

    let [num, setNum] = useState(1);
    const nums = [1,2,3,4,5,6,7,8,9,10];

    return (
        <div>
            <div className="container">
                <div className="inner-container">
                    <h1>Multiplication Tables</h1>
                </div>

                <div className="inner-container">
                    <form>
                        <div className="inner-container">
                            <label for="num">Enter Number:: </label>
                            <input type="number" id="num" name="num" onChange={(e) => setNum(e.target.value)} />
                        </div>
                    </form>

                    <div className="inner-container">
                        <table>
                            {
                                nums.map((i) => 
                                    (
                                        <tr>
                                            <td>{num}</td>
                                            <td> x </td>
                                            <td>{i}</td>
                                            <td> = </td>
                                            <td>{num * i}</td>
                                        </tr>
                                    )
                                )
                            }
                        </table>
                        {/* {nums.map((i) => `${num} x ${i} = ${num*i}`)} */}
                    </div>
                </div>
            </div>
        </div>
    )
}

//THIS BELOW METHOD USES INNERHTML TO MODIFY THE DIV ELEMENT.
//WE WILL DO THIS WITHOUT THE INNERHTML ABOVE !!!
// export const Multiplicationtables = () => {

//     let [mynum, setMyNum] = useState(0);

//     let calculate = () => {
//         let htmlStr = "";

//         for(let i=1;i<11;i++){
//             let eqStr = `${mynum} x ${i} = ${parseInt(mynum) * i}`;
//             htmlStr += eqStr + "<br/>";
//         }

//         document.getElementById("res").innerHTML = htmlStr;
        
//     }

//     return (
//         <div>
//             <div>
//             <form>
//                 <label for="mynum">Enter Number:: </label>
//                 <input type="text" id="mynum" name="mynum" onChange={(e) => {setMyNum(e.target.value);}}/>
//                 <br />
//                 <input type="button" value="Generate" onClick={calculate}/>
//                 <br />
//                 <div type="text" id="res"></div>
//             </form>
//             </div>
//         </div>
//     )
// }
