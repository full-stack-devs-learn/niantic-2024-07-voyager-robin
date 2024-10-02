import './ProductCard.css'

export default function ProductCard(product)
{
    return(
        <div className="card product-card">
            <div id="product-body" className="card-body">
                Id: {product.id}<br />
                Name: {product.name} <br />
                Quantity per Unit: {product.quantityPerUnit}<br />
                Unit Price: {product.unitPrice}</div>
        </div>
    )
}