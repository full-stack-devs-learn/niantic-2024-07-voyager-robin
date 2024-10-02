import { useState, useEffect } from 'react';
import ProductCard from '../product-card/ProductCard.jsx'
import './ProductCardContainer.css'
import productService from '../../../services/product-service.js';

export default function ProductCardContainer()
{
    const [products, setProducts] = useState([]);

    useEffect(() => {
        productService.getAllProducts().then(data => {
            setProducts(data);
        })
    }, [])

    return(
        <main className="container mt-4 products-container" id="products-container">
        {
            products.map((product) => (
                         <ProductCard key={product.id}
                         id={product.id}
                         name={product.name}
                         categoryId={product.categoryId}
                         quantityPerUnit={product.quantityPerUnit}
                         unitPrice={product.unitPrice}
                         ></ProductCard>
            ))
        }
        </main>
    )
}