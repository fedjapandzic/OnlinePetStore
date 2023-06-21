import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';

const Toys = () => {
  const [data, setData] = useState([
    // Toys data objects
  ]);

  return <CardWrapper data={data} />;
};

export default Toys;
