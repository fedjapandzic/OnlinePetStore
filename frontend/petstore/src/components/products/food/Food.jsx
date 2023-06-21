import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';

const Food = () => {
  const [data, setData] = useState([
    // Food data objects
  ]);

  return <CardWrapper data={data} />;
};

export default Food;
