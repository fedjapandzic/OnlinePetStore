import React from 'react';
import './App.css';
import Header from './components/header/Header.jsx';
import Content from './components/Content.jsx';
import Cat from './components/products/cat/Cat.jsx';
import Dog from './components/products/dog/Dog.jsx';
import Birds from './components/products/birds/Birds.jsx';
import Food from './components/products/food/Food.jsx';
import Toys from './components/products/toys/Toys.jsx';
import Other from './components/products/other/Other.jsx';
import {
  BrowserRouter as Router,
  Route,
  Routes,
} from "react-router-dom";
const App = () => {
  return (
    <div className="app">
      <Header></Header>
      <Routes>
        <Route exact path="/" Component={Content} />
        <Route path="/cats" Component={Cat} />
        <Route path="/dogs" Component={Dog} />
        <Route path="/birds" component={Birds} />
        <Route path="/food" component={Food} />
        <Route path="/toys" component={Toys} />
        <Route path="/other" component={Other} />
      </Routes>
    </div >
  );
};

export default App;
