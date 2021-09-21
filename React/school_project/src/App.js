import logo from './logo.svg';
import './App.css';
import Add from './components/AddTwoNos';
import {Subtracttwonumbers} from './components/subtracttwonumbers';
import {Multiplicationtables} from './components/multiplicationtables';
import {Counter} from './components/counter';
import Student from './components/student';
import InsertStudent from './components/insertstudentform';

function App() {
  return (
    <div className="App">
      <Add/>
      <hr />
      <Subtracttwonumbers/>
      <hr />
      <Multiplicationtables />
      <hr />
      <Counter />
      <hr />
      <Student />
      <hr />
      <InsertStudent />
      <hr />
    </div>
  );
}

export default App;
