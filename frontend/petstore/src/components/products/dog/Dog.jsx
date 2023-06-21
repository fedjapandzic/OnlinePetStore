
import React, { useState } from 'react';
import CardWrapper from '../../cards/CardWrapper';
const Dog = () => {
    const [data, setData] = useState([
        {
          "title": "Labrador Retriever",
          "description": "The Labrador Retriever is a friendly and outgoing breed known for its loyalty and intelligence.",
          "imageUrl": "https://encrypted-tbn1.gstatic.com/licensed-image?q=tbn:ANd9GcRN1jO98wDKnx1aGhY4SaEIGEGxXkaH4tu_SS-6WOWpFXb46jIMYIhZAlEFKAV4m1vC-q-J1OcBqX782to"
        },
        {
          "title": "German Shepherd",
          "description": "The German Shepherd is a courageous and versatile breed, often used as a working dog in various fields such as law enforcement and search and rescue.",
          "imageUrl": "https://encrypted-tbn1.gstatic.com/licensed-image?q=tbn:ANd9GcTo7Ip1_kUvkTHPE7QSLlCr_-hYsl8ts_HQ997mQ14iiD3mbds6IZCz_kC_f2VAxM4bsgvbaegk70M3hXQ"
        },
        {
          "title": "Golden Retriever",
          "description": "The Golden Retriever is a gentle and affectionate breed, known for its intelligence and obedience. It is often regarded as a great family pet.",
          "imageUrl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Golden_Retriever_Dukedestiny01_drvd.jpg/640px-Golden_Retriever_Dukedestiny01_drvd.jpg"
        },
        {
          "title": "Bulldog",
          "description": "The Bulldog is a medium-sized breed with a sturdy build and a distinctive wrinkled face. Despite their tough appearance, they are typically gentle and loyal.",
          "imageUrl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Bulldog_inglese.jpg/1200px-Bulldog_inglese.jpg"
        },
        {
          "title": "Poodle",
          "description": "The Poodle is a highly intelligent and trainable breed, known for its curly coat and elegant appearance. They come in different sizes, including standard, miniature, and toy.",
          "imageUrl": "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcRxfqSjBuNplIuvG_nvuHF9qkZ2F6cWhhl55GqxZ_kZNPJ9KsaerGhfnyinsDNuUrz7I2AiwvitRqgHflg"
        },
        {
          "title": "Beagle",
          "description": "The Beagle is a small to medium-sized breed known for its friendly and merry temperament. They are often energetic and enjoy outdoor activities.",
          "imageUrl": "https://cdn.britannica.com/16/234216-050-C66F8665/beagle-hound-dog.jpg"
        },
        {
          "title": "Siberian Husky",
          "description": "The Siberian Husky is a medium-sized working breed originally bred for sled-pulling. They are known for their striking appearance and energetic nature.",
          "imageUrl": "https://encrypted-tbn3.gstatic.com/licensed-image?q=tbn:ANd9GcQVIYgxyZGmuHAmIdkk-ykz1Jkj-w2gADjrvoq4sDpaAQSJZmv00q6OdwC5vghUHxi5TgY7gD0INW29eOI"
        }
      ]
      );
    return (
        <CardWrapper data={data}></CardWrapper>
    );
}


export default Dog;