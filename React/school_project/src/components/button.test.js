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
    })
})