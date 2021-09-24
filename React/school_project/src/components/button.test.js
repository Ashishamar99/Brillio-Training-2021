// import Enzyme, {mount, shallow, render} from './enzyme' // IMPORT STMT FROM EMZYME
import Enzyme, {mount, shallow, configure, render} from 'enzyme'
import ReusableButtonProps from './reusablebuttonprops' //IMPORT YOUR COMPONENT
import React from 'react'

import Adapter from 'enzyme-adapter-react-16';
import renderer from 'react-test-renderer';
configure({ adapter: new Adapter() }); //enzyme - react 16 hooks support

describe('this is a button testing module', () => {
    it('to check if button component is loaded or not', () => {

        //Write the test case here.
        //This will check if 'shallow' is a command and if it's able to mount or not.
        const wrapper = shallow(<ReusableButtonProps value="test" handleClick={() => {}} />);
    });

    it('to check if button exists or not', () => {
        const wrapper = shallow(<ReusableButtonProps value="test" handleClick={() => {}} />);
        const len = wrapper.find("button").length; // We will be checking if we can "FIND" the 'button' tag on the virtual DOM.
        expect(len).toBe(1); // If there is one button, length will be 1. If there are n buttons, length will be n.
    });

    //USE .trim() ON THE STRING (RECEIVED VALUE) TO CHECK FOR EXPECTED VALUE IN expect(). 
    it('to check if proper message is displayed on the button or not', () => {
        const wrapper = shallow(<ReusableButtonProps value="test" handleClick={() => {}} />);
        const len = wrapper.find("button").at(0).text(); 
        expect(len.trim()).toEqual("test"); // We can see that in the test case we are mounting buttons with the value="test" which is why we will be comparing it to "test"
    });

    //USE .trim() ON THE STRING (RECEIVED VALUE) TO CHECK FOR EXPECTED VALUE IN expect(). 
    it('to check the name of the button', () => {
        const wrapper = shallow(<ReusableButtonProps value="submit" handleClick={() => {}} />);
        const len = wrapper.find("button").at(0).text(); 
        expect(len.trim()).toEqual("submit");
    });
})

import Counter from './counter'

//FOR THE TEST CASE TO WORK EITHER cc SHOULD HAVE A DEFAULT EXPORT OR USE AN rfce. 
describe('this is a counter testing module', () => {
    it('to check if counter component is loaded or not', () => {
        const wrapper = shallow(<Counter />);
    });

    it('to check the number of buttons in the counter component', () => {
        const wrapper = shallow(<Counter />);
        const len = wrapper.find("ReusableButtonProps").length;
        expect(len).toBe(2);
    });

    it('to check instance of counter', () => {
        const wrapper = shallow(<Counter />);
        let inst = wrapper.instance();
        expect(inst.state.num).toBe(0);
    });

    //TODO: Implement Simulation Testing on a button component.
    it("to check increase Count function of counter", () => {
        const wrapper = shallow(<Counter />);
        // let obj = new Counter();
        // obj.incCount();
        // expect(obj.state.num).toBe(1);
        let inst = wrapper.instance();
        inst.incCount();
        // wrapper.find("button").at(0).simulate("click");
        expect(inst.state.num).toBe(1);
    });
})